import java.util.ArrayList;

class RootModel {

	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CopyrightModel _copyright;
	public String end_time;
	public String code_of_conduct;
	public int id;
	public String description;
	public VersionModel _version;
	public String organizer_description;
	public String privacy;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String schedule_published_on;
	public String type;
	public String organizer_name;
	public String topic;
	public String logo;

	public RootModel(String email, String start_time, CreatorModel creator, String background_image, String name, Call_for_papersModel call_for_papers, String timezone, CopyrightModel copyright, String end_time, String code_of_conduct, int id, String description, VersionModel version, String organizer_description, String privacy, String state, ArrayList<Social_linksModel> social_links, String location_name, String schedule_published_on, String type, String organizer_name, String topic, String logo) {

		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._copyright = copyright;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.description = description;
		this._version = version;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.state = state;
		this.social_links = social_links;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;

	}

}