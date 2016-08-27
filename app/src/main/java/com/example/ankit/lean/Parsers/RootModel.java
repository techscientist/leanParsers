import java.util.ArrayList;

class RootModel {

	public int id;
	public String privacy;
	public String organizer_description;
	public String start_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String end_time;
	public String name;
	public String type;
	public CreatorModel _creator;
	public String email;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public String description;
	public String topic;
	public String location_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String background_image;
	public String state;

	public RootModel(int id, String privacy, String organizer_description, String start_time, String schedule_published_on, String code_of_conduct, String end_time, String name, String type, CreatorModel creator, String email, CopyrightModel copyright, String timezone, VersionModel version, String description, String topic, String location_name, String logo, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_name, String background_image, String state) {

		this.id = id;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this.email = email;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.description = description;
		this.topic = topic;
		this.location_name = location_name;
		this.logo = logo;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;

	}

}