import java.util.ArrayList;

class RootModel {

	public String logo;
	public String email;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String topic;
	public String end_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public String name;
	public String code_of_conduct;
	public String type;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String background_image;
	public int id;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String logo, String email, String privacy, String timezone, String organizer_name, String description, String state, Call_for_papersModel call_for_papers, String location_name, String topic, String end_time, VersionModel version, CreatorModel creator, String name, String code_of_conduct, String type, String schedule_published_on, CopyrightModel copyright, String organizer_description, String start_time, String background_image, int id, ArrayList<Social_linksModel> social_links) {

		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.description = description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.topic = topic;
		this.end_time = end_time;
		this._version = version;
		this._creator = creator;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.id = id;
		this.social_links = social_links;

	}

}