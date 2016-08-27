import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String privacy;
	public String logo;
	public String description;
	public String topic;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public VersionModel _version;
	public String email;
	public String timezone;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CopyrightModel _copyright;
	public String name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;

	public RootModel(String location_name, String privacy, String logo, String description, String topic, String start_time, String organizer_description, String organizer_name, Call_for_papersModel call_for_papers, String code_of_conduct, int id, String background_image, VersionModel version, String email, String timezone, String type, ArrayList<Social_linksModel> social_links, String end_time, CopyrightModel copyright, String name, String schedule_published_on, CreatorModel creator, String state) {

		this.location_name = location_name;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.email = email;
		this.timezone = timezone;
		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this._copyright = copyright;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;

	}

}