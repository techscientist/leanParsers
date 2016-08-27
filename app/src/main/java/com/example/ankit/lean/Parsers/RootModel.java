import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public String start_time;
	public String schedule_published_on;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CopyrightModel _copyright;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;
	public VersionModel _version;
	public String description;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public String topic;

	public RootModel(String location_name, int id, String start_time, String schedule_published_on, String logo, CreatorModel creator, String organizer_description, String type, Call_for_papersModel call_for_papers, String background_image, CopyrightModel copyright, String end_time, ArrayList<Social_linksModel> social_links, String email, String timezone, VersionModel version, String description, String privacy, String name, String code_of_conduct, String state, String organizer_name, String topic) {

		this.location_name = location_name;
		this.id = id;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._copyright = copyright;
		this.end_time = end_time;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;
		this._version = version;
		this.description = description;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}