import java.util.ArrayList;

class RootModel {

	public String start_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String location_name;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public String type;
	public String end_time;
	public String description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CopyrightModel _copyright;
	public String privacy;
	public int id;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String state;

	public RootModel(String start_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, String topic, String location_name, VersionModel version, String background_image, String logo, String type, String end_time, String description, String organizer_name, Call_for_papersModel call_for_papers, String name, CopyrightModel copyright, String privacy, int id, String organizer_description, String schedule_published_on, String email, String code_of_conduct, String timezone, String state) {

		this.start_time = start_time;
		this._creator = creator;
		this.social_links = social_links;
		this.topic = topic;
		this.location_name = location_name;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;

	}

}